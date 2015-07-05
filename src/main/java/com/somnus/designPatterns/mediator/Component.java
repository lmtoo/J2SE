package com.somnus.designPatterns.mediator;

/**
 * @Title: Component.java
 * @Package com.somnus.designPatterns.mediator
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月25日 下午10:31:17
 * @version V1.0
 */
// 抽象组件类：抽象同事类
public abstract class Component {
	protected Mediator mediator;

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	// 转发调用
	public void changed() {
		mediator.componentChanged(this);
	}

	public abstract void update();
}

// 按钮类：具体同事类
class Button extends Component {
	public void update() {
		// 按钮不产生交互
	}
}

// 列表框类：具体同事类
class List extends Component {
	public void update() {
		System.out.println("列表框增加一项：张无忌。");
	}

	public void select() {
		System.out.println("列表框选中项：小龙女。");
	}
}

// 组合框类：具体同事类
class ComboBox extends Component {
	public void update() {
		System.out.println("组合框增加一项：张无忌。");
	}

	public void select() {
		System.out.println("组合框选中项：小龙女。");
	}
}

// 文本框类：具体同事类
class TextBox extends Component {
	public void update() {
		System.out.println("客户信息增加成功后文本框清空。");
	}

	public void setText() {
		System.out.println("文本框显示：小龙女。");
	}
}
