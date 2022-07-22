package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycleWithInterface implements InitializingBean,DisposableBean
{
		private double pepsiPrice;

		@Override
		public String toString() {
			return "LifeCycleWithInterface [pepsiPrice=" + pepsiPrice + "]";
		}

		public LifeCycleWithInterface() {
			super();
			// TODO Auto-generated constructor stub
		}

		public double getPepsiPrice() {
			return pepsiPrice;
		}

		public void setPepsiPrice(double pepsiPrice) {
			this.pepsiPrice = pepsiPrice;
		}

		public void afterPropertiesSet() throws Exception
		{
		//init work start here
			System.out.println("taking pepsi");
		}

		public void destroy() throws Exception 
		{
			System.out.print("destroy");
			
		}
		

}
