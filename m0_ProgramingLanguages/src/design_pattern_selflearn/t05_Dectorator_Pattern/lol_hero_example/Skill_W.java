package design_pattern_selflearn.t05_Dectorator_Pattern.lol_hero_example;

public class Skill_W extends SkillsDecorator{

    private String skillName;

    public Skill_W(Hero hero, String skillName) {
        super(hero);
        this.skillName = skillName;
    }

    @Override
    public void learnSkills() {
        System.out.println("学习了技能Q: " + skillName);
        super.learnSkills();
    }

}
