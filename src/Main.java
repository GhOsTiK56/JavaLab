public class Main {
    public static void main(String[] args) {
        Contact contact1 = new Contact(1, "Ноутбук", "Вася Пупкин", "2024-10-06 10:00", 1);
        Contact contact2 = new Contact(2, "Телефон", "Петя Васечкин", "2024-10-07 11:00", 2);
        Contact contact3 = new Contact(3, "Планшет", "Федор Михайлович", "2024-10-08 12:00", 1);

        GroupContact groupContact = new GroupContact();
        groupContact.setUniqueId(3);
        groupContact.addContact(contact1);
        groupContact.addContact(contact2);
        groupContact.addContact(contact3);

        System.out.println("До сортировки:");
        System.out.println(groupContact);

        groupContact.sortContactsByName();
        System.out.println("После сортировки по названию заказа:");
        System.out.println(groupContact);

        groupContact.sortContactsByType();
        System.out.println("После сортировки по срочности заказа:");
        System.out.println(groupContact);

        groupContact.removeContactById(2);
        System.out.println("После удаления 2 заказа:");
        System.out.println(groupContact);
    }
}