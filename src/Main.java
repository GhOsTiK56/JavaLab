public class Main {
    public static void main(String[] args) {
        // Создаем несколько объектов Contact
        Contact contact1 = new Contact(1, "Laptop", "Courier A", "2024-10-06 10:00", 1);
        Contact contact2 = new Contact(2, "Smartphone", "Courier B", "2024-10-07 11:00", 2);
        Contact contact3 = new Contact(3, "Tablet", "Courier A", "2024-10-08 12:00", 1);

        // Создаем объект GroupContact и добавляем в него контакты
        GroupContact groupContact = new GroupContact();
        groupContact.setUniqueId(101);
        groupContact.addContact(contact1);
        groupContact.addContact(contact2);
        groupContact.addContact(contact3);


// Выводим информацию о группе до сортировки
        System.out.println("Before sorting:");
        System.out.println(groupContact);

        // Сортируем контакты по имени и выводим информацию после сортировки
        groupContact.sortContactsByName();
        System.out.println("After sorting by name:");
        System.out.println(groupContact);

        // Удаляем контакт по идентификатору и выводим информацию после удаления
        groupContact.removeContactById(2);
        System.out.println("After removing contact with ID 2:");
        System.out.println(groupContact);
    }
}