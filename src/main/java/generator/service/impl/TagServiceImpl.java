package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yupi.usercenter.model.domain.Tag;
import generator.service.TagService;
import generator.mapper.TagMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【tag(标签)】的数据库操作Service实现
* @createDate 2023-11-10 19:30:14
*/
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag>
    implements TagService{

}




