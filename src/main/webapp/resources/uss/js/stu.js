'use strict'
var stu = stu || {}
stu.truncate = x => {
	$.getJSON(`${x}/students/truncate`,
	 		d => { location.reload()})}
stu.insertMany = x => {
	$.getJSON(`${x}/students/insert-many/${$('#stu-data-count').val()}`, 
			d => { location.reload()})}


stu.count = x => {
	$.getJSON(`${x}/students/count`, d => {$(`#stu-count`).text(d)})}
stu.list = x => {
	$.getJSON(`${x}/students`, d => { 
		$(`<h3/>`)
		.attr({id: `title`})
		.text(`학생목록`)
		.appendTo(`#mgr-data-mgt-stu`)
		$(`<table/>`)
		.attr({id: `tab`})
		.css({width: `100%`})
		.appendTo(`#title`) 
		$(`<tr/>`).attr({id: `tr_1`}).appendTo(`#tab`)
		const arr = [`No`,`아이디`,`이름`,`생년월일`,`성별`,`등록일`,`전공과목`]
		$.each(arr, function(i,j){
			$(`<th>${j}</th>`).css({backgroundColor: `gray`})
			.appendTo(`#tr_1`)
		})
		$.each(d, (i, j) => {
			$(`<tr><td>${j.stuNum}</td>
		   	    		<td>${j.userid}</td>
		   	    		<td>${j.name}</td>
						<td>${j.birthday}</td>
						<td>${j.gender}</td>
						<td>${j.regDate}</td>
						<td>${j.subject}</td></tr>`)
						.css({padding: `15px`, textAlign: `left`, fontSize: `medium`})
						.appendTo(`#tab`)
		})
		$(`<div/>`)
		.attr({id: `stu_page`})
		.addClass(`pagination`)
		.appendTo(`#mgr-data-mgt-stu`)
		const arr2 = [`<<`, `1`, `2`, `3`, `4`, `5`, `6`, `>>`]
		$.each(arr2, (i, j) => {
			$(`<a/>`)
			.attr({href: `#`})
			.text(`${j}`)
			.appendTo(`#stu_page`)
			.click(e=>{
				e.preventDefault()
				alert(j)
			})
		})
	})
}