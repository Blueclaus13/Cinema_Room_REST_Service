class Person {
    String name;
    int age;
}

class MakingChanges {
    public static void changeIdentities(Person p1, Person p2) {
        String nameTop2 = p1.name;
        int ageTop2 = p1.age;
        String nameTop1 = p2.name;
        int ageTop1 = p2.age;

        p1.name= nameTop1;
        p1.age = ageTop1;
        p2.name = nameTop2;
        p2.age = ageTop2;

    }
}