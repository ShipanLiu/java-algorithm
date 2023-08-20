package design_pattern_selflearn.t05_Dectorator_Pattern.lol_hero_example;

/*
* Step1:  装饰模式为已有类动态附加额外的功能就像LOL、王者荣耀等类Dota游戏中，英雄升级一样。每次英雄升级都会附加一个额外技能点学习技能。具体的英雄就是ConcreteComponent，技能栏就是装饰器Decorator，每个技能就是ConcreteDecorator；
*
* */

public interface Hero {
//    学习技能
    void learnSkills();
}
