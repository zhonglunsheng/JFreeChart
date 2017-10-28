package cm.zls.chart.bar;

import javax.servlet.http.HttpSession;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.servlet.ServletUtilities;
import org.jfree.data.category.DefaultCategoryDataset;

public class BarChart {

	public static String genBarChart(HttpSession session)throws Exception{
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		dataset.addValue(510, "深圳", "苹果");
		dataset.addValue(543, "深圳", "香蕉");
		dataset.addValue(413, "深圳", "粒子");
		dataset.addValue(123, "上海", "香蕉");
		dataset.addValue(45, "北京", "粒子");
		dataset.addValue(84, "成都", "橘子");
		JFreeChart chart = ChartFactory.createBarChart3D("水果销售统计图", "水果", "销售", dataset, PlotOrientation.VERTICAL, true, true, true);
		String fileName = ServletUtilities.saveChartAsJPEG(chart, 700, 500, null,session);
		return fileName;
	}
}
