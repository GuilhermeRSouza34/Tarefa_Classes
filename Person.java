/**
 * Esta é a classe Person, que representa uma pessoa com nome e idade.
 */

public class Person {

    private String name;
    private int age;

    /**
     * Construtor da classe Person.
     *
     * @param name O nome da pessoa.
     * @param age  A idade da pessoa.
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Obtém o nome da pessoa.
     *
     * @return O nome da pessoa.
     */
    public String getName() {
        return name;
    }

    /**
     * Define o nome da pessoa.
     *
     * @param nome O novo nome da pessoa.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Obtém a idade da pessoa.
     *
     * @return A idade da pessoa.
     */
    public int getAge() {
        return age;
    }

    /**
     * Define a idade da pessoa.
     *
     * @param age A nova idade da pessoa.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Imprime informações sobre a pessoa.
     */
    public void printInfo() {
        System.out.println("Nome: " + name);
        System.out.println("idade: " + age + " anos");
    }

    /**
     * Verifica se a pessoa é maior de idade.
     *
     * @return true se a pessoa for maior de idade, false caso contrário.
     */
    public boolean isAdult() {
        return age >= 18;
    }

    /**
     * Método principal para testar a classe Person.
     */
    public static void main(String[] args) {
        Person person = new Person("Guilherme", 20);
        person.printInfo();

        if (person.isAdult()) {
            System.out.println(person.getName() + " é maior de idade.");
        } else {
            System.out.println(person.getName() + " não é maior de idade.");
        }
    }
}