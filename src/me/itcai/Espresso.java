/**
 * @Title:Espresso.java
 * @Package:me.itcai
 * @Description:TODO
 * @Author Jason
 * @Email caihaiboy@gmail.com
 * @Date 2012-8-18 下午04:00:41
 * @Version V1.0
 */
package me.itcai;

/**
 * @ClassName:Espresso
 * @Description:浓缩咖啡
 * @Author Jason
 * @Email caihaiboy@gmail.com
 * @Date 2012-8-18 下午04:00:41
 *
 */
public class Espresso extends Beverage {

	/**
	 * <p>Title:</p>
	 * <p>Description:</p>
	 */
	public Espresso() {
		description = "Espresso";
	}

	/* (non-Javadoc)
	 * <p>Title:cost</p>
	 * <p>Description:</p>
	 * @return
	 * @see me.itcai.Beverage#cost()
	 */
	@Override
	public double cost() {
		return 1.99;
	}

}
