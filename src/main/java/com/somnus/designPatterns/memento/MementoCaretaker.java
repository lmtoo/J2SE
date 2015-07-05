package com.somnus.designPatterns.memento;

/** 
 * @Title: MementoCaretaker.java 
 * @Package com.somnus.designPatterns.memento 
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月24日 下午5:44:33 
 * @version V1.0 
 */
//象棋棋子备忘录管理类：负责人
public class MementoCaretaker {
    private ChessmanMemento memento;  
    
    public ChessmanMemento getMemento() {  
        return memento;  
    }  
  
    public void setMemento(ChessmanMemento memento) {  
        this.memento = memento;  
    } 
}
