class Contact {
    private int id; // Идентификатор
    private String name; // Название товара
    private String courier; // Курьер (Ответственный за доставку)
    private String dateTime; // Дата и время
    private int type; // Тип заказа (1 - срочный, 2 - обычный заказ)

    public Contact() {
    }

    public Contact(int id, String name, String courier, String dateTime, int type) {
        this.id = id;
        this.name = name;
        this.courier = courier;
        this.dateTime = dateTime;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourier() {
        return courier;
    }

    public void setCourier(String courier) {
        this.courier = courier;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("Contact {id=%d, name='%s', courier='%s', dateTime='%s', type=%d}",
                id, name, courier, dateTime, type);
    }
}