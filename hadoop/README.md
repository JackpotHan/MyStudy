**结构**
    HSSF － 提供读写Microsoft Excel格式档案的功能。
    XSSF － 提供读写Microsoft Excel OOXML格式档案的功能。
    HWPF － 提供读写Microsoft Word格式档案的功能。
    HSLF － 提供读写Microsoft PowerPoint格式档案的功能。
    HDGF － 提供读写Microsoft Visio格式档案的功能。

**HSSF和XSSF**
    HSSF用来操作Office 2007版本前excel.xls文件
    HSSF在org.apache.poi.hssf.usermodel包中。它实现了Workbook 接口，用于Excel文件中的.xls格式 
   ```
	HSSFWorkbook excel的文档对象
	    HSSFSheet excel的表单
	    HSSFRow excel的
	    HSSFCell excel的格子单元
	    HSSFFont excel字体
	    HSSFDataFormat 日期格式 
	    HSSFHeader sheet头
	    HSSFFooter sheet尾（只有打印的时候才能看到效果） 
	样式：  
		 HSSFCellStyle cell样式
    辅助操作包括：
        HSSFDateUtil 日期  
        HSSFPrintSetup 打印   
        HSSFErrorConstants 错误信息表
  ```
  XSSF用来操作Office 2007版本后的excel.xlsx文件
  XSSF在org.apache.xssf.usemodel包，并实现Workbook接口，用于Excel文件中的.xlsx格式
  
	常用组件：
		XSSFWorkbook excel的文档对象
		XSSFSheet excel的表单
		XSSFRow excel的行
		XSSFCell excel的格子单元
		XSSFFont excel字体
		XSSFDataFormat 日期格式
		其他和HSSF类似;
  ``