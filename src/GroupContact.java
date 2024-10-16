import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class GroupContact {
    private int uniqueId; // Уникальный номер группы
    private List<Contact> contacts; // Массив объектов Contact

    // Конструктор по умолчанию
    public GroupContact() {
        this.contacts = new ArrayList<>();
    }

    // Конструктор с параметром - массив объектов
    public GroupContact(List<Contact> contacts) {
        this.contacts = contacts;
    }

    // Геттер и сеттер для уникального номера
    public int getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(int uniqueId) {
        this.uniqueId = uniqueId;
    }

    // Геттер и сеттер для массива объектов
    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    // Метод для добавления контакта в массив
    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    // Метод для удаления контакта по идентификатору
    public void removeContactById(int id) {
        contacts.removeIf(contact -> contact.getId() == id);
    }

    // Метод для сортировки массива (сортируем по имени контакта)
    public void sortContactsByName() {
        contacts.sort(Comparator.comparing(Contact::getName));
    }

    // Переопределение метода toString для вывода полной информации об объекте GroupContact
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("GroupContact {uniqueId=" + uniqueId + ", contacts=\n");
        for (Contact contact : contacts) {
            sb.append("  ").append(contact).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }
}