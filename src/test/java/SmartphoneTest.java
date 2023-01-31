import org.example.Contact;
import org.example.Friend;
import org.example.Smartphone;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneTest {

    @Test
    public void testStartRadio(){
        Smartphone smartphone = new Smartphone();
        boolean result = smartphone.startRadio();
        Assertions.assertTrue(result);
    }

    @Test
    public void testStopRadio(){
        Smartphone smartphone = new Smartphone();
        boolean result = smartphone.stopRadio();
        Assertions.assertFalse(result);
    }

    @Test
    public void testGetPosition(){
        Smartphone smartphone = new Smartphone();
        String result = smartphone.getPosition();
        Assertions.assertEquals( "Köln", result);
    }

    @Test
    public void testAddContact(){
        Smartphone smartphone = new Smartphone();
        //List<Contact> contacts = new ArrayList<>();

        smartphone.addContact(new Friend("Rüdiger", 566789 ));

        Assertions.assertEquals(1, smartphone.getContactlist().size());

    }

    @Test
    public void testRemoveContact(){
        

        List<Contact> contacts = new ArrayList<>();

        contacts.add(new Friend("Rüdiger", 566789 ));
        contacts.add(new Friend("Rüdiger1", 5664349 ));
        contacts.add(new Friend("Rüdiger2", 43566789 ));

        Smartphone smartphone = new Smartphone("iPhone", "Apple", contacts);

        smartphone.removeContactByName("Rüdiger1");

        Assertions.assertEquals(2, smartphone.getContactlist().size());

    }









}
