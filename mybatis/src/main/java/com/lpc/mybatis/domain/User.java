package com.lpc.mybatis.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author byu_rself
 * @create 2021/9/7 20:46
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Integer id;
    private String name;
    private Integer age;
    private String sex;
    private String createTime;



}
