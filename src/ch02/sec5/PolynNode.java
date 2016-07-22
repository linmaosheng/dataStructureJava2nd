package ch02.sec5;

/**
 * 2.5.线性表的应用举例
 * ->[例2.6]编程实现一元多项式的加法。
 * ->多项式的结点，作为链表(LNode)的数据元素(data)
 */
public class PolynNode {
	public double coef;	// 系数
	public int expn;	// 指数

	public PolynNode(double coef, int expn) {	// 构造函数
		this.coef = coef;
		this.expn = expn;
	}

}
