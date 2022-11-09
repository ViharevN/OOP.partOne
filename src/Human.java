public class Human {
    int yearOfBirth;
    String name;
    String town;
    String jobTitle;


    Human(String name, int yearOfBirth,  String town, String jobTitle) {
        if (name == null || name.length()==0) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
        if (town == null || town.length() == 0) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
        if (jobTitle == null || jobTitle.length() == 0) {
            this.jobTitle = "Информация не указана";
        } else {
            this.jobTitle = jobTitle;
        }

    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name +
                " Я из города " + town +
                " Я родился в " + yearOfBirth + " году."+
                " Я работаю на должности "+jobTitle+
                " году. Будем знакомы!";
    }
}
