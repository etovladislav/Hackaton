<!doctype html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <title>Document</title>

    <script src="../../resources/js/jquery-2.1.3.min.js"></script>
    <script src="../../resources/js/bootstrap.min.js"></script>
    <script src="../../resources/js/main.js"></script>


    <link rel="stylesheet" type="text/css" href="../../resources/css/bootstrap.css"/>
    <link rel="stylesheet" type="text/css" href="../../resources/css/left-panel.css"/>
    <link rel="stylesheet" type="text/css" href="../../resources/css/container.css"/>
    <link rel="stylesheet" type="text/css" href="../../resources/css/diagram.css"/>
    <link rel="stylesheet" type="text/css" href="../../resources/css/charbar.css"/>

    <link rel="stylesheet" href="../../resources/fonts/font-awesome-4.4.0/font-awesome-4.4.0/css/font-awesome.min.css">
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
                    <h1 id="page-name">Статистика</h1>

                    <div class="col-lg-5">
                        <table class="table">
                            <tr class="table-header">
                                <td class="header-item">Часто посещаемые страницы</td>
                                <td class="header-item">Процент</td>
                            </tr>
                            <tr>
                                <td id="pieChart" class="chart"></td> <!--диаграмма-->
                                <td id="values"></td>
                            </tr>
                        </table>
                    </div>


                    <div class="col-lg-4 col-md-offset-1">
                        <div class="table-header" id="div-charbar">
                            <p class="header-item">Время пребывания на странице</p>
                        </div>

                        <div id="chart"></div>
                    </div>




                </div>
            </div>
        </div>
    </div>
</div>

<script src="../../resources/js/diagram.js"></script>
<script src="../../resources/js/charbar.js"></script>

