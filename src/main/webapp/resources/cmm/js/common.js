'use strict'
var common = common || {}
common = (()=>{
	const init = ctx => {
		localStorage.setItem('ctx', ctx)
		$('#home').click(e => { location.href = '/'})
		$('#manager_register').click(e => {location.href = `${ctx}/admin/mgr/register`})
		$('#teacher_register').click(e => {location.href = `${ctx}/admin/tea/register`})
		$(`#linkedin`).click(e => {location.href = `${ctx}/`})
		$(`#stu-join`).click(e => {location.href = `${ctx}/user/register`})
		$(`#stu-login`).click(e => {location.href = `${ctx}/user/login`})
		$(`#blog_default`).click(e => {location.href = `${ctx}/content/bbs/index`})
		$(`#icon1`).html(`<img src="https://ibighit.com/bts/images/bts/profile/member-rm.jpg" alt="">`)
		$(`#icon2`).html(`<img src="https://ibighit.com/bts/images/bts/profile/member-jin.jpg" alt="">`)
		$(`#icon3`).html(`<img src="https://ibighit.com/bts/images/bts/profile/member-suga.jpg" alt="">`)
		$(`#title`).text(`원어민 어학 사이트`)
		$(`#message`).text(`화상강의솔루션, 스카이프 등을 이용하여 필리핀등 원어민 강사와 \n
							한국 학생간에 회화 교육을 하는 사이트 구축.`)
		$(`#bbs`).html(`<a href="#">게시판<i class="fa fa-angle-down"></i></a>
						<ul id="ul" role="menu" class="sub-menu"></ul>`)
		$('#facebook').click(e => {location.href = '/transfer/sym/tea/index'})
		let arr = [{id:'a', val: 'a'}, {id:'b', val: 'b'},{id:'c', val: 'c'},{id:'d', val: 'd'},{id:'e', val: 'c'}]
		$.each(arr, (i, j) => {
			$(`<li/>`)
			.attr({id: `${j.id}`})
			.text(`${j.val}`)
			.appendTo(`#ul`)
			.click(e => {
				alert(`${j.id}`)
			})
		})
		
	}
	const goHome = () => {
		$(`#goHome`).click(e => {
			location.href = ` ${localStorage.getItem('ctx')}/`})
	}
	return {init, goHome}
})()