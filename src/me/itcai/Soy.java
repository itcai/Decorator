/**
 * @Title:Soy.java
 * @Package:me.itcai
 * @Description:TODO
 * @Author Jason
 * @Email caihaiboy@gmail.com
 * @Date 2012-8-18 下午04:31:48
 * @Version V1.0
 */
package me.itcai;

/**
 * @ClassName:Soy
 * @Description:TODO 
 * @Author Jason
 * @Email caihaiboy@gmail.com
 * @Date 2012-8-18 下午04:31:48
 *
 */
public class Soy extends CondimentDecorator {
	
	Beverage beverage;
	
	/**
	 * <p>Title:</p>
	 * <p>Description:</p>
	 * @param beverage
	 */
	public Soy(Beverage beverage) {
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
		return beverage.getDescription() + ", Soy";
	}

	/* (non-Javadoc)
	 * <p>Title:cost</p>
	 * <p>Description:</p>
	 * @return
	 * @see me.itcai.Beverage#cost()
	 */
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .15 + beverage.cost();
	}

}
