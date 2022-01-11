package org_example.java_jenkins_in_docker;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
public class TestMain {
@Test
public void testInputIsEven(){
assertTrue(Main.EvenOrOdd(22)); //Assertion
}
}