package com.somnus.designPatterns.flyweight;

/**
 * @Title: IgoChessman.java
 * @Package com.somnus.designPatterns.flyweight
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月25日 上午9:27:25
 * @version V1.0
 */
// 围棋棋子类：抽象享元类
public abstract class IgoChessman {
    public abstract String getColor();

    public void display(Coordinates coord) {
    	System.out.println("棋子颜色：" + this.getColor() + "，棋子位置：" + coord.getX() + "，" + coord.getY() );
    }
}

// 黑色棋子类：具体享元类
class BlackIgoChessman extends IgoChessman {
    public String getColor() {
        return "黑色";
    }
}

// 白色棋子类：具体享元类
class WhiteIgoChessman extends IgoChessman {
    public String getColor() {
        return "白色";
    }
}
