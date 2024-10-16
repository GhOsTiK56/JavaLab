import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class GroupContact {
    private int uniqueId;
    private List<Contact> contacts;

    public GroupContact() {
        this.contacts = new ArrayList<>();
    }

    public GroupContact(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public int getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(int uniqueId) {
        this.uniqueId = uniqueId;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void removeContactById(int id) {
        contacts.removeIf(contact -> contact.getId() == id);
    }

    public void sortContactsByName() {
        contacts.sort(Comparator.comparing(Contact::getName));
    }

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