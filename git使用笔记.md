# 一.创建本地仓库

## 1.绑定用户

```
git config --global user.name "用户名"
git config --global user.email "邮箱"
```

## 2.为github账户设置sshkey

### 生成sshkey

```
ssh-keygen -t rsa（一般按三下回车）

输入您要保存密钥文件的路径和名称。例如：C:\Users\YourName.ssh\id_rsa。也可以选择保留默认名称，因为它已经被 SSH 所识别（id_rsa）；

在弹出的窗口中输入密码，或者直接敲击回车键选择不设置密码；

这个时候，您会得到一个公共密钥（id_rsa.pub）和一个私有密钥（id_rsa）。
```

### 打开GitHub的settings 新建ssh 将id_rsa.pub粘贴进去

# 二.上传本地项目到GitHub

## 1.初始化仓库

```
git init 
```

## 2.添加所有文件到仓库

```
# 此命令会把所有更改的文件全部暂存起来。
git add . 

# 如果要单个来，只需要 . 替换成对应的文件名即可。
git add 文件名
```

## 3.把文件提交到本地仓库

```
git commit -m"注释内容" （注释必须写）
```

## 4.关联GitHub仓库

### 复制仓库地址

![](C:\Users\16953\Desktop\git\git使用笔记_图示.png)

### 执行命令

```
git remote add origin 仓库地址
```

# 三.上传本地代码

```
git push -u origin master
```

# 四.克隆远程仓库

```
git clone 远程仓库地址
```

# 五.其他指令

## 查看本地仓库

```
git ls-files
```

## 显示所有本地分支（master，uesr）

```
git branch
```

## 删除文件（都可以删，不知道区别）

### 删除Windows目录下的文件

```
rm -rf 文件名
```

### 从Git中删除文件

```
git rm  文件名
```

