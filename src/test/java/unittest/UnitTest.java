package unittest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tool.Tool;

import java.util.ArrayList;

public class UnitTest {

    @Test
    public void testIfToolCanBeAdded(){
        ArrayList<Tool> toolList = new ArrayList<>();
        Tool newWrench = new Tool(101,"wrench", "15/16");

        Assertions.assertTrue(toolList.isEmpty());

        toolList.add(newWrench);

        Assertions.assertFalse(toolList.isEmpty());
        Assertions.assertTrue(toolList.contains(newWrench));
    }

    @Test
    public void testIfToolCanBeRemoved(){
        ArrayList<Tool> toolList = new ArrayList<>();
        Tool newWrench = new Tool(101,"wrench", "15/16");

        toolList.add(newWrench);
        Assertions.assertFalse(toolList.isEmpty());

        toolList.remove(newWrench);
        Assertions.assertTrue(toolList.isEmpty());
    }

    @Test
    public void testToolGetID(){
        Tool wrench = new Tool(101, "wrench", "15/16");

        Assertions.assertEquals(101, wrench.getId());
    }

    @Test
    public void testToolGetName(){
        Tool wrench = new Tool(101, "wrench", "15/16");

        Assertions.assertEquals("wrench", wrench.getName());
    }

    @Test
    public void testToolGetDescription(){
        Tool wrench = new Tool(101, "wrench", "15/16");

        Assertions.assertEquals("15/16", wrench.getDescription());
    }

    @Test
    public void testToolSetId() {
        Tool wrench = new Tool(101, "wrench", "15/16");
        wrench.setId(120);

        Assertions.assertNotEquals(101, wrench.getId());
        Assertions.assertEquals(120, wrench.getId());
    }

    @Test
    public void testToolSetName() {
        Tool wrench = new Tool(101, "wrench", "15/16");
        wrench.setName("adjustable wrench");

        Assertions.assertNotEquals("wrench", wrench.getName());
        Assertions.assertEquals("adjustable wrench", wrench.getName());
    }

    @Test
    public void testToolSetDescription(){
        Tool wrench = new Tool(101, "wrench", "15/16");
        wrench.setDescription("7/8");

        Assertions.assertNotEquals("15/16", wrench.getDescription());
        Assertions.assertEquals("7/8", wrench.getDescription());
    }

    @Test
    public void testToolToString(){
        Tool wrench = new Tool(101, "wrench", "15/16");

        Assertions.assertEquals("ID: 101, Name: wrench, Description: 15/16\n", wrench.toString());
    }

    @Test
    public void testToolCreatedInMemory(){
        Tool emptyTool = new Tool();

        Assertions.assertNotNull(emptyTool);
    }

}
