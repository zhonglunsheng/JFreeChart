package cm.zls.chart.bar;

import javax.servlet.http.HttpSession;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.servlet.ServletUtilities;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.DatasetUtilities;

public class BarChart {

	public static String genBarChart(HttpSession session)throws Exception{
		//按地区分类显示
		double [][]data = new double[][]{{1320,1100,451,1247},{720,456,1247,214},{830,875,456,1200},{400,874,1023,954}};
		String []rowKeys={"苹果","香蕉","橘子","梨子"};
		String []columnKeys={"深圳","北京","上海","南京"};
		CategoryDataset dataset = DatasetUtilities.createCategoryDataset(rowKeys, columnKeys, data);
		JFreeChart chart = ChartFactory.createBarChart3D("水果销售统计图", "水果", "销售", dataset, PlotOrientation.VERTICAL, true, true, true);
		String fileName = ServletUtilities.saveChartAsJPEG(chart, 700, 500, null,session);
		return fileName;
	}
}
