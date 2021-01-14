동적 SQL을 처리하는 방법
OGNL 기반의 표현식
if
choose (when, otherwise)
trim (where, set)
foreach
if
<select id="find" 
	parameterType="com.gms.web.Command"
	resultType="com.gms.web.Domain"> 
	SELECT * FROM BLOG 
    WHERE state = 'ACTIVE' 
  <if test="title != null">
    AND title like '%${name}%'
  </if>
  <if test="author != null and author.name != null">
    AND author_name like #{member.name}
  </if>
</select>
<select id="findActiveBlogLike" resultType="Blog">
  SELECT * FROM BLOG WHERE state = 'ACTIVE'
  <choose>
    <when test="title != null">
      AND title like #{title}
    </when>
    <when test="author != null and author.name != null">
      AND author_name like #{author.name}
    </when>
    <otherwise>
      AND featured = 1
    </otherwise>
  </choose>
</select>
<select id="selectPostIn" resultType="domain.blog.Post">
  SELECT *
  FROM POST P
  WHERE ID in
  <foreach item="item" index="index" collection="list"
      open="(" separator="," close=")">
        #{item}
  </foreach>
</select>