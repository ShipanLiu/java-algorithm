package design_pattern_selflearn.t05_Dectorator_Pattern.lol_hero_example;


//ConcreteComponent 具体英雄盲僧
public class BlindMonk implements Hero {

    private String name;

    public BlindMonk(String name) {
        this.name = name;
    }

    @Override
    public void learnSkills() {
        System.out.println(name + " 学了以上技能");
    }
}
