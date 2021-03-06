package org.teachingkidsprogramming.recipes.completed.section09final;

import org.junit.Assert;
import org.junit.Test;
import org.teachingextensions.approvals.lite.util.FormattedException;

//  Step 1: SELECT the method name (twoCircles on line 25), then click the Run Button
//            Keyboard shortcut to run ->  PC: Ctrl+F11 or Mac: Command+fn+F11
//  Step 2: READ the name of the method that failed
//  Step 3: FILL IN the blank (___) to make that method pass
//  Step 4: SAY at least one thing you just learned
//  Step 5: GO to the next method
//  IMPORTANT - Do not change anything except the blank (___)
// 
//*****************In Progress************************//
//  Looking at using and providing descriptive error messages - uses 'Magic Numbers' on purpose to demonstrate how they make code hard to read 
//  NOTE for Deep Dive Authors: Copy 'answer' to TKPJava course09 section (for students) when done
//
@SuppressWarnings("unused")
public class DeepDive09
{
  @Test
  public void exceptionsShouldProvideInformation() throws Exception
  {
    Chain c = createChain();
    //the answer is "surprise", but why?  be sure to use the debugger to follow the execution path.
    int answer = c.get("a").get("b").get(___).get("d").get("e").value;
    Assert.assertEquals(2048, answer);
  }
  @Test
  public void exceptionsShouldProvideUsefulInformation() throws Exception
  {
    Chain c = createChain();
    int answer = c.get("a").get(___).get("c").get("d").get("e").value;
    //the answer is "surprise", but why?  be sure to use the debugger to follow the execution path.
    Assert.assertEquals(2048, answer);
  }
  @Test
  public void exceptionsShouldExplainPreconditions() throws Exception
  {
    Game game = new Game();
    /* Add needed line here -- game.turnOn(); -- need to figure out how to abstract this */
    //game.turnOn();
    int fun = game.play();
    Assert.assertEquals(11, fun);
  }
  @Test
  public void exceptionsShouldExplainAllPreconditions() throws Exception
  {
    Game game = new Game();
    /* Add needed line here -- game.turnOn(1); -- need to figure out how to abstract this */
    //game.turnOn(1);
    int fun = game.play();
    Assert.assertEquals(11, fun);
  }
  /**
   * Ignore the following, It's needed to run the homework
   * 
   * 
   * 
   */
  public String  ___  = "You need to fill in the blank ___";
  public Integer ____ = -99;
  private static class Chain
  {
    private String label;
    private Chain  chain;
    public int     value;
    public Chain(String label, Chain chain)
    {
      this.label = label;
      this.chain = chain;
    }
    public Chain(int value)
    {
      this.value = value;
    }
    public Chain get(String string)
    {
      if (!label.equals(
          string)) { throw new FormattedException("There is no value for '%s', please use '%s'", string, label); }
      return chain;
    }
  }
  private Chain createChain()
  {
    return new Chain("a", new Chain("b", new Chain("surprise", new Chain("d", new Chain("e", new Chain(2048))))));
  }
  private static class _____ extends Exception
  {
    private static final long serialVersionUID = 7013264013388843231L;
    public _____(String message, Exception originalException)
    {
      super(message, originalException);
    }
  }
  private int call(int a, int b, int c)
  {
    if (((a + c) / 2) == b) { throw new FormattedException("%s is not a valid input for (%s, %s, %s)", b, a, b,
        c); }
    return a + b + c;
  }
  private static class Game
  {
    boolean on = false;
    public void turnOn()
    {
      on = true;
    }
    public void turnOn(int howMany)
    {
      on = true;
    }
    public int play()
    {
      if (!on) { throw new FormattedException(
          "Before you can play a game you need to turn it on.\n game.turnOn()"); }
      //shows use of 'magic numbers'
      return 11;
    }
  }
}
