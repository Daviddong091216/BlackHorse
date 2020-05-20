package day11.ClassAsVariable;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("Mike");
        hero.setAge(20);

        Weapon weapon = new Weapon("AAA");
        hero.setWeapon(weapon);

//        Skill skill = new Skill();
//        hero.setSkill(skill);

        SkillImpl skillImpl = new SkillImpl();
        hero.setSkill(skillImpl);
        hero.attack();
        System.out.println("=============");
        Skill skill = new Skill(){
            @Override
            public void use() {
                System.out.println("Pa.....Pa....");
            }
        };
        hero.setSkill(skill);
        hero.attack();
        System.out.println("=============");

        hero.setSkill(new Skill(){
            @Override
            public void use() {
                System.out.println("Hong.....Hong....");
            }
        });
        hero.attack();


    }
}
