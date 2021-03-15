## Setup
To run this project, with Docker:
1. Setup Docker
2. Open cmd run:
cd to bug_report folder source code.
```
$ docker build -t bug_report .
```
```
$ docker-compose up -d
```
3. Wait 10 minutes or more. And go http://localhost:8080
#
- Admin account:
  - admin@gmail.com
  - 1234
- User account:
  - user@gmail.com
  - 1234
#
#Built with
- Java Spring  - The web framework used
- Maven - Dependency Management
```
.
├───java
│   └───com
│       └───example
│           └───bug_report
│               │   BugReportApplication.java
│               │
│               ├───config
│               │       Constant.java
│               │
│               ├───controller
│               │   │   CommentController.java
│               │   │   HomeController.java
│               │   │   PostController.java
│               │   │   SearchController.java
│               │   │   UserController.java
│               │   │
│               │   └───admin
│               │           DashboardController.java
│               │           ManagerPostController.java
│               │           ManagerUserController.java
│               │
│               ├───entity
│               │       Comment.java
│               │       Post.java
│               │       Role.java
│               │       Status.java
│               │       User.java
│               │
│               ├───exception
│               │       BadRequestException.java
│               │       DuplicateRecordException.java
│               │
│               ├───model
│               │   ├───mapper
│               │   │       UserMapper.java
│               │   │
│               │   └───request
│               │           CreateCommentReq.java
│               │           CreatePostReq.java
│               │           CreateUserReq.java
│               │           LoginReq.java
│               │           SearchReq.java
│               │           UpdateUserReq.java
│               │
│               ├───repository
│               │       ICommentRepository.java
│               │       IPostRepository.java
│               │       IRoleRepository.java
│               │       IStatusRepository.java
│               │       IUserRepository.java
│               │
│               ├───security
│               │       ConfigInterceptor.java
│               │       CustomUserDetails.java
│               │       RedirectUrlRole.java
│               │       UserDetailsServiceImpl.java
│               │       WebMvcConfig.java
│               │       WebSecurityConfig.java
│               │
│               ├───service
│               │   │   ICommentService.java
│               │   │   IPostService.java
│               │   │   IRoleService.java
│               │   │   IStatusService.java
│               │   │   IUserService.java
│               │   │
│               │   └───Impl
│               │           CommentService.java
│               │           PostService.java
│               │           RoleService.java
│               │           StatusService.java
│               │           UserService.java
│               │
│               └───utils
│                       FileUploadManager.java
│                       PageUtil.java
│
└───resources
    │   application.properties
    │
    ├───photo
    ├───static
    │   ├───css
    │   ├───script
    │   └───vendor
    └───templates
        │   create_post.html
        │   index.html
        │   login_modal.html
        │   post.html
        │   register_modal.html
        │   search.html
        │
        ├───admin
        │   │   dashboard.html
        │   │
        │   ├───blog
        │   │       edit.html
        │   │       posts.html
        │   │
        │   └───user
        │           users.html
        │           user_details.html
        │
        ├───error
        │       401.html
        │       403.html
        │       404.html
        │       500.html
        │
        ├───fragment
        │       header.html
        │
        └───layout
                layout.html
                layout_modal.html
```
