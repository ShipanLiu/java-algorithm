package design_pattern_selflearn.t05_Dectorator_Pattern.lol_hero_example;

//Decorator 技能栏
public abstract class SkillsDecorator implements Hero{

    private Hero hero;

    public SkillsDecorator(Hero hero) {
        this.hero = hero;
    }

    @Override
    public void learnSkills() {
        if(hero != null) {
            hero.learnSkills();
        }
    }


}
