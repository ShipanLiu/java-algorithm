package design_pattern_selflearn.t05_Dectorator_Pattern.lol_hero_example;

public class Player {
    public static void main(String[] args) {
        Hero hero = new BlindMonk("二蛋");

        SkillsDecorator q = new Skill_Q(new BlindMonk("盲僧1"),  "猛龙摆尾");
        SkillsDecorator w = new Skill_W(new BlindMonk("盲僧1"),  "天音波/回音击");

        q.learnSkills();
        w.learnSkills();
    }
}
