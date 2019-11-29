package test;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.elasticjob.lite.annotation.ElasticSimpleJob;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author 孙勇军（089245）
 * @since 2019/11/28
 */
@ElasticSimpleJob(cron = "30 * * * * ?", jobName = "test123", shardingTotalCount = 1, jobParameter = "测试参数", shardingItemParameters = "0=A,1=B")
@Component
public class MySimpleJob implements com.dangdang.ddframe.job.api.simple.SimpleJob {

    @Override
    public void execute(ShardingContext shardingContext) {
        System.out.println(new Date() + String.format("------Thread ID: %s, 任务总片数: %s, " +
                        "当前分片项: %s.当前参数: %s," +
                        "当前任务名称: %s.当前任务参数: %s"
                , Thread.currentThread().getId(),
                shardingContext.getShardingTotalCount(),
                shardingContext.getShardingItem(),
                shardingContext.getShardingParameter(),
                shardingContext.getJobName(),
                shardingContext.getJobParameter()));
        throw new RuntimeException("task fail!!!!!!!!!!!");
    }
}
