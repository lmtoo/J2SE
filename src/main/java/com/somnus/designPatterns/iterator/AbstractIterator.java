package com.somnus.designPatterns.iterator;

import java.util.List;

/**
 * @Title: AbstractIterato.java
 * @Package com.somnus.designPatterns.iterator
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月26日 上午11:45:58
 * @version V1.0
 */
// 抽象迭代器
public interface AbstractIterator {
    public void next(); // 移至下一个元素

    public boolean isLast(); // 判断是否为最后一个元素

    public void previous(); // 移至上一个元素

    public boolean isFirst(); // 判断是否为第一个元素

    public Object getNextItem(); // 获取下一个元素

    public Object getPreviousItem(); // 获取上一个元素
}

// 商品迭代器：具体迭代器
class ProductIterator implements AbstractIterator {
    private ProductList productList;
    private List products;
    private int cursor1; // 定义一个游标，用于记录正向遍历的位置
    private int cursor2; // 定义一个游标，用于记录逆向遍历的位置

    public ProductIterator(ProductList list) {
        this.productList = list;
        this.products = list.getObjects(); // 获取集合对象
        cursor1 = 0; // 设置正向遍历游标的初始值
        cursor2 = products.size() - 1; // 设置逆向遍历游标的初始值
    }

    public void next() {
        if (cursor1 < products.size()) {
            cursor1++;
        }
    }

    public boolean isLast() {
        return (cursor1 == products.size());
    }

    public void previous() {
        if (cursor2 > -1) {
            cursor2--;
        }
    }

    public boolean isFirst() {
        return (cursor2 == -1);
    }

    public Object getNextItem() {
        return products.get(cursor1);
    }

    public Object getPreviousItem() {
        return products.get(cursor2);
    }
}