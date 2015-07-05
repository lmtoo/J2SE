package com.somnus.designPatterns.builder;

/**
 * @Title: ActorBuilder.java
 * @Package com.somnus.designPatterns.builder
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月24日 下午3:35:42
 * @version V1.0
 */
// 角色建造器：抽象建造者
public abstract class ActorBuilder {
    protected Actor actor = new Actor();

    public abstract void buildType();

    public abstract void buildSex();

    public abstract void buildFace();

    public abstract void buildCostume();

    public abstract void buildHairstyle();

    // 工厂方法，返回一个完整的游戏角色对象
    public Actor createActor() {
        return actor;
    }
}

// 天使角色建造器：具体建造者
class AngelBuilder extends ActorBuilder {
    public void buildType() {
        actor.setType("天使");
    }

    public void buildSex() {
        actor.setSex("女");
    }

    public void buildFace() {
        actor.setFace("漂亮");
    }

    public void buildCostume() {
        actor.setCostume("白裙");
    }

    public void buildHairstyle() {
        actor.setHairstyle("披肩长发");
    }
}

// 恶魔角色建造器：具体建造者
class DevilBuilder extends ActorBuilder {
    public void buildType() {
        actor.setType("恶魔");
    }

    public void buildSex() {
        actor.setSex("妖");
    }

    public void buildFace() {
        actor.setFace("丑陋");
    }

    public void buildCostume() {
        actor.setCostume("黑衣");
    }

    public void buildHairstyle() {
        actor.setHairstyle("光头");
    }
}

// 英雄角色建造器：具体建造者
class HeroBuilder extends ActorBuilder {
    public void buildType() {
        actor.setType("英雄");
    }

    public void buildSex() {
        actor.setSex("男");
    }

    public void buildFace() {
        actor.setFace("英俊");
    }

    public void buildCostume() {
        actor.setCostume("盔甲");
    }

    public void buildHairstyle() {
        actor.setHairstyle("飘逸");
    }
}
