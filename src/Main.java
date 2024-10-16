public class Main {
    public static void main(String[] args) {
        Contact contact1 = new Contact(1, "Laptop", "Courier A", "2024-10-06 10:00", 1);
        Contact contact2 = new Contact(2, "Smartphone", "Courier B", "2024-10-07 11:00", 2);
        Contact contact3 = new Contact(3, "Tablet", "Courier A", "2024-10-08 12:00", 1);

        GroupContact groupContact = new GroupContact();
        groupContact.setUniqueId(101);
        groupContact.addContact(contact1);
        groupContact.addContact(contact2);
        groupContact.addContact(contact3);

        System.out.println("Before sorting:");
        System.out.println(groupContact);

        groupContact.sortContactsByName();
        System.out.println("After sorting by name:");
        System.out.println(groupContact);

        groupContact.removeContactById(2);
        System.out.println("After removing contact with ID 2:");
        System.out.println(groupContact);
    }
}