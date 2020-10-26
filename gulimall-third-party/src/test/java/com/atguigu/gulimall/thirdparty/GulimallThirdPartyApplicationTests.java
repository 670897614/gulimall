package com.atguigu.gulimall.thirdparty;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.OSSClientBuilder;

@SpringBootTest
class GulimallThirdPartyApplicationTests {

	@Test
	void contextLoads() {
	}
	@Resource
	OSSClient ossClient;

	@Test
	public void testUpload() throws FileNotFoundException {
//		// Endpoint以杭州为例，其它Region请按实际情况填写。
//		String endpoint = "oss-cn-shanghai.aliyuncs.com";
//		// 云账号AccessKey有所有API访问权限，建议遵循阿里云安全最佳实践，创建并使用RAM子账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建。
//		String accessKeyId = "";
//		String accessKeySecret = "";
//
//		//创建OSSClient实例。
//		OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
//
//		//上传文件流。
		InputStream inputStream = new FileInputStream("");
		ossClient.putObject("", "", inputStream);

		// 关闭OSSClient。
		ossClient.shutdown();
		System.out.println("success");
	}

}
