<!doctype html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <title>Document</title>

    <script src="/resources/js/jquery-2.1.3.min.js"></script>
    <script src="/resources/js/bootstrap.min.js"></script>
    <script src="/resources/js/main.js"></script>
    <script src="/resources/js/questions.js"></script>
    <link rel="stylesheet" type="text/css" href="/resources/css/bootstrap.css"/>
    <link rel="stylesheet" type="text/css" href="/resources/css/left-panel.css"/>
    <link rel="stylesheet" type="text/css" href="/resources/css/right-panel.css"/>
    <link rel="stylesheet" type="text/css" href="/resources/css/container.css"/>
    <link rel="stylesheet" href="/resources/fonts/font-awesome-4.4.0/font-awesome-4.4.0/css/font-awesome.min.css">
    <link href="//netdna.bootstrapcdn.com/font-awesome/3.2.1/css/font-awesome.min.css" rel="stylesheet">

</head>
<body>
<div id="wrapper">
    <div class="overlay"></div>

    <!-- Sidebar -->
    <nav class="navbar navbar-inverse navbar-fixed-top" id="sidebar-wrapper" role="navigation">
        <ul class="nav sidebar-nav">
            <li class="sidebar-brand">
                <img src="../../resources/image/logo.png">
            </li>

            <li>
                <a href="/admin">Мои сценарии</a>
            </li>

            <li>
                <a href="/statistic">Статистика</a>
            </li>
        </ul>
    </nav>
    <!-- /#sidebar-wrapper -->

    <!-- Page Content -->
    <div id="page-content-wrapper">
        <button type="button" class="hamburger is-closed" data-toggle="offcanvas">
            <span class="hamb-top"></span>
            <span class="hamb-middle"></span>
            <span class="hamb-bottom"></span>
        </button>
        <div class="container-fluid">
            <div class="row">
                <div class="col-lg-12 col-sm-offset-1">
                    <h1 id="page-name">Мои сценарии</h1>

                    <div class="col-lg-4">
                        <div class="header"><p>Готовые сценарии</p></div>

                        <div class="panel-group" id="accordion">

                        </div>

                        <button class="btn btn-default btn-add-helper" data-toggle="modal" data-target="#myModal">
                            Создать подсказку
                        </button>

                    <#--Модальное окно-->
                        <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
                             aria-hidden="true">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <button type="button" class="close" data-dismiss="modal"
                                                aria-hidden="true">&times;</button>
                                        <h4 class="modal-title" id="myModalLabel">Создать подсказку</h4>
                                    </div>
                                    <div class="modal-body" id="modal-body">
                                        <form class="form-horizontal">
                                            <div class="form-group">
                                                <label for="url" class="col-sm-3 control-label">Стартовый url:</label>
                                                <div class="col-sm-9">
                                                    <input type="text" class="form-control" id="url"
                                                           placeholder="URL">
                                                </div>
                                            </div>
                                        </form>

                                    </div>
                                    <div class="modal-footer">
                                        <button type="button" class="btn btn-default" data-dismiss="modal">Закрыть
                                        </button>
                                        <button type="button" class="btn btn-primary" onclick="getEndUrls()">Получить конечные url</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    <#---->


                    </div>

                    <div class="col-lg-4 col-md-offset-1">
                        <div class="header" style="margin-bottom: 0"><p>Заданные вопросы</p></div>
                        <div class="col-lg-12 wrapper">
                            <div class="question-item">asdasdasdas</div>
                            <div class="question-item">asdasdasdas</div>
                            <div class="question-item">asdasdasdas</div>
                            <div class="question-item">asdasdasdas</div>
                            <div class="question-item">asdasdasdas</div>
                        </div>
                    </div>

                </div>
            </div>
        </div>
    </div>
    <!-- /#page-content-wrapper -->

</div>
<!-- /#wrapper -->
</body>
</html>