package com.wyac.common.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * https://blog.csdn.net/briblue/article/details/73824058
 * 注解是附加在代码中的一些元信息，用于一些工具在编译、运行时进行解析和使用，起到说明、配置的功能。注解不会也不能影响代码的实际逻辑，仅仅起到辅助性的作用
 * https://blog.csdn.net/weixin_39919527/article/details/80383292
 * 注解的定义，注解通过 @interface 关键字进行定义。
 *
 *
 * 元注解也是一张标签，但是它是一张特殊的标签，它的作用和目的就是给其他普通的标签进行解释说明的。
 * 元标签有 @Retention、@Documented、@Target、@Inherited、@Repeatable 5 种。
 *
 *  @Retention它的取值如下：
 * - RetentionPolicy.SOURCE 注解只在源码阶段保留，在编译器进行编译时它将被丢弃忽视。
 * - RetentionPolicy.CLASS 注解只被保留到编译进行的时候，它并不会被加载到 JVM 中。
 * - RetentionPolicy.RUNTIME 注解可以保留到程序运行的时候，它会被加载进入到 JVM 中，所以在程序运行时可以获取到它们。
 *
 * @Documented
 * 顾名思义，这个元注解肯定是和文档有关。它的作用是能够将注解中的元素包含到 Javadoc 中去。
 *
 * @Target
 * Target 是目标的意思，@Target 指定了注解运用的地方。
 *
 * 你可以这样理解，当一个注解被 @Target 注解时，这个注解就被限定了运用的场景。
 * 类比到标签，原本标签是你想张贴到哪个地方就到哪个地方，但是因为 @Target 的存在，它张贴的地方就非常具体了，比如只能张贴到方法上、类上、方法参数上等等。@Target 有下面的取值
 *
 * ElementType.ANNOTATION_TYPE 可以给一个注解进行注解
 * ElementType.CONSTRUCTOR 可以给构造方法进行注解
 * ElementType.FIELD 可以给属性进行注解
 * ElementType.LOCAL_VARIABLE 可以给局部变量进行注解
 * ElementType.METHOD 可以给方法进行注解
 * ElementType.PACKAGE 可以给一个包进行注解
 * ElementType.PARAMETER 可以给一个方法内的参数进行注解
 * ElementType.TYPE 可以给一个类型进行注解，比如类、接口、枚举
 *
 * @Inherited
 * Inherited 是继承的意思，但是它并不是说注解本身可以继承，而是说如果一个超类被 @Inherited 注解过的注解进行注解的话，那么如果它的子类没有被任何注解应用的话，那么这个子类就继承了超类的注解。
 * 说的比较抽象。代码来解释。
 */

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE})
public @interface EFModuleAnnotation {
    String moduleName();

    String delegateName();
}
