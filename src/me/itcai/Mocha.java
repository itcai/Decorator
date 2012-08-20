/**
 * @Title:Mocha.java
 * @Package:me.itcai
 * @Description:TODO
 * @Author Jason
 * @Email caihaiboy@gmail.com
 * @Date 2012-8-18 下午04:26:51
 * @Version V1.0
 */
package me.itcai;

/**
 * @ClassName:Mocha
 * @Description:TODO 
 * @Author Jason
 * @Email caihaiboy@gmail.com
 * @Date 2012-8-18 下午04:26:51
 *
 */
public class Mocha extends CondimentDecorator {
	
	Beverage beverage;
	
	/**
	 * <p>Title:</p>
	 * <p>Description:</p>
	 * @param beverage
	 */
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	/* (non-Javadoc)
	 * <p>Title:getDescription</p>
	 * <p>Description:</p>
	 * @return
	 * @see me.itcai.CondimentDecorator#getDescription()
	 */
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	/* (non-Javadoc)
	 * <p>Title:cost</p>
	 * <p>Description:</p>
	 * @return
	 * @see me.itcai.Beverage#cost()
	 */
	@Override
	public double cost() {
		return .20 + beverage.cost();
	}

}
