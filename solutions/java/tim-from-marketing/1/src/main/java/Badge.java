class Badge {
    public String print(Integer id, String name, String department) {
        // owner 
        if (department == null) {
            department = "OWNER";
        }
        // new employee
        if (id == null) {
            return name + " - " + department.toUpperCase();
        }
        return String.format("[%d] - %s - %s", id, name, department.toUpperCase());
    }
}
