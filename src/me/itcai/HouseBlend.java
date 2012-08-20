/**
 * @Title:HouseBlend.java
 * @Package:me.itcai
 * @Description:TODO
 * @Author Jason
 * @Email caihaiboy@gmail.com
 * @Date 2012-8-18 下午04:19:49
 * @Version V1.0
 */
package me.itcai;

/**
 * @ClassName:HouseBlend
 * @Description:TODO 
 * @Author Jason
 * @Email caihaiboy@gmail.com
 * @Date 2012-8-18 下午04:19:49
 *
 */
public class HouseBlend extends Beverage {
	
	/**
	 * <p>Title:</p>
	 * <p>Description:</p>
	 */
	public HouseBlend() {
		description = "HouseBlend";
	}

	/* (non-Javadoc)
	 * <p>Title:cost</p>
	 * <p>Description:</p>
	 * @return
	 * @see me.itcai.Beverage#cost()
	 */
	@Override
	public double cost() {
		return .89;
	}

}
