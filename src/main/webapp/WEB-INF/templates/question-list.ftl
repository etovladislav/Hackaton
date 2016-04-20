<#list questions as question>
<div class="panel panel-default">
    <div class="panel-heading">
        <h4 class="panel-title">
            <a data-toggle="collapse" data-parent="#accordion" href="#${question.id}" style="text-decoration: none">
            ${question.text}
            </a>
            <a href="" style="float: right"><i class="fa fa-close text-right"></i></a>
        </h4>
    </div>
    <div id="${question.id}" class="panel-collapse collapse">
        <div class="panel-body">
        ${question.description}
        </div>
    </div>
</div>
</#list>