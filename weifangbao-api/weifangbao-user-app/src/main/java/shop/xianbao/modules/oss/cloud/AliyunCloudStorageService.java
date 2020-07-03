/**
 * Copyright (c) 2018 仙宝框架 All rights reserved.
 * <p>
 * https://www.ruitukeji.com
 * <p>
 * 版权所有，侵权必究！
 */

package shop.xianbao.modules.oss.cloud;

//import com.aliyun.oss.OSSClient;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/**
 * 阿里云存储
 *
 * @author Tim tim@ruitukeji.com
 */
public class AliyunCloudStorageService extends AbstractCloudStorageService {

    public AliyunCloudStorageService(CloudStorageConfig config) {
        this.config = config;
    }

    @Override
    public String upload(byte[] data, String path) {
        return upload(new ByteArrayInputStream(data), path);
    }

    @Override
    public String upload(InputStream inputStream, String path) {
        //        OSSClient client = new OSSClient(config.getAliyunEndPoint(), config.getAliyunAccessKeyId(),
        //                config.getAliyunAccessKeySecret());
        //        try {
        //            client.putObject(config.getAliyunBucketName(), path, inputStream);
        //            client.shutdown();
        //        } catch (Exception e){
        //            throw new XianbaoException(ErrorCode.OSS_UPLOAD_FILE_ERROR, e, "");
        //        }

        return config.getAliyunDomain() + "/" + path;
    }

    @Override
    public String uploadSuffix(byte[] data, String suffix) {
        return upload(data, getPath(config.getAliyunPrefix(), suffix));
    }

    @Override
    public String uploadSuffix(InputStream inputStream, String suffix) {
        return upload(inputStream, getPath(config.getAliyunPrefix(), suffix));
    }
}