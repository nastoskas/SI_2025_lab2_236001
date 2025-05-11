import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    @Test
    void everyStatementTest() {
        assertThrows(RuntimeException.class, () -> SILab2.checkCart(null,"1231"));
        List<Item> itemList = List.of(new Item("item0", 10, 100, 0.2), new Item("item1", 9, 105, 0.0), new Item("", 0, 305,0.0) );
        assertThrows(RuntimeException.class, () -> SILab2.checkCart(itemList, "123456789120546"));
        List<Item> itemList1 = List.of(new Item("item2", 10, 100, 0.2));
        assertThrows(RuntimeException.class, () -> SILab2.checkCart(itemList1,null));
        List<Item> itemList2 = List.of(new Item("item3", 10, 100, 0.2));
        assertThrows(RuntimeException.class, () -> SILab2.checkCart(itemList2,"123*478503695444"));
        List<Item> itemList3 = List.of(new Item("item4", 10, 100, 0.1));
        assertEquals(870, SILab2.checkCart(itemList3,"1234445559980011"));
    }
    @Test
    void multipleConditionTest(){
        List<Item> itemList = List.of(new Item("item0", 10, 310, 0));
        assertEquals(3070,SILab2.checkCart(itemList,"1234445559980011"));
        List<Item> itemList1 = List.of(new Item("item1", 10, 200, 0.1));
        assertEquals(1770,SILab2.checkCart(itemList1,"1234445559980011"));
        List<Item> itemList2 = List.of(new Item("item2", 10, 100, 0));
        assertEquals(1000,SILab2.checkCart(itemList2,"1234445559980011"));

    }
}