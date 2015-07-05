package com.somnus.designPatterns.mediator;

/**
 * @Title: Mediator.java
 * @Package com.somnus.designPatterns.mediator
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月25日 下午10:30:21
 * @version V1.0
 */
// 抽象中介者
public abstract class Mediator {
	public abstract void componentChanged(Component c);
}

// 具体中介者
class ConcreteMediator extends Mediator {
	// 维持对各个同事对象的引用
	public Button addButton;
	public List list;
	public TextBox userNameTextBox;
	public ComboBox cb;

	// 封装同事对象之间的交互
	public void componentChanged(Component c) {
		// 单击按钮
		if (c == addButton) {
			System.out.println("--单击增加按钮--");
			list.update();
			cb.update();
			userNameTextBox.update();
		}
		// 从列表框选择客户
		else if (c == list) {
			System.out.println("--从列表框选择客户--");
			cb.select();
			userNameTextBox.setText();
		}
		// 从组合框选择客户
		else if (c == cb) {
			System.out.println("--从组合框选择客户--");
			cb.select();
			userNameTextBox.setText();
		}
	}
}
