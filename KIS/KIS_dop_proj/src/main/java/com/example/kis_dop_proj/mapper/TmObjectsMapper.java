package com.example.kis_dop_proj.mapper;

import java.util.List;

import com.example.kis_dop_proj.model.TmObjects;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

public interface TmObjectsMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Insert({
        "insert into tm_objects (id_poezd, vrsvop, ",
        "dis_esr, dis_park, ",
        "dis_put, nom_poezd, ",
        "esr_f, pn_sost, esr_n, ",
        "pr_grup, pr_soed, ",
        "kodop_p, kateg_poezd, ",
        "esr_napr, esr_napr_prib)",
        "values (#{idPoezd,jdbcType=NUMERIC}, #{vrsvop,jdbcType=TIMESTAMP}, ",
        "#{disEsr,jdbcType=VARCHAR}, #{disPark,jdbcType=VARCHAR}, ",
        "#{disPut,jdbcType=VARCHAR}, #{nomPoezd,jdbcType=VARCHAR}, ",
        "#{esrF,jdbcType=VARCHAR}, #{pnSost,jdbcType=VARCHAR}, #{esrN,jdbcType=VARCHAR}, ",
        "#{prGrup,jdbcType=VARCHAR}, #{prSoed,jdbcType=VARCHAR}, ",
        "#{kodopP,jdbcType=VARCHAR}, #{kategPoezd,jdbcType=NUMERIC}, ",
        "#{esrNapr,jdbcType=VARCHAR}, #{esrNaprPrib,jdbcType=VARCHAR})"
    })
    int insert(TmObjects row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Select({
        "select",
        "id_poezd, vrsvop, dis_esr, dis_park, dis_put, nom_poezd, esr_f, pn_sost, esr_n, ",
        "pr_grup, pr_soed, kodop_p, kateg_poezd, esr_napr, esr_napr_prib",
        "from tm_objects"
    })
    @Results({
        @Result(column="id_poezd", property="idPoezd", jdbcType=JdbcType.NUMERIC),
        @Result(column="vrsvop", property="vrsvop", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="dis_esr", property="disEsr", jdbcType=JdbcType.VARCHAR),
        @Result(column="dis_park", property="disPark", jdbcType=JdbcType.VARCHAR),
        @Result(column="dis_put", property="disPut", jdbcType=JdbcType.VARCHAR),
        @Result(column="nom_poezd", property="nomPoezd", jdbcType=JdbcType.VARCHAR),
        @Result(column="esr_f", property="esrF", jdbcType=JdbcType.VARCHAR),
        @Result(column="pn_sost", property="pnSost", jdbcType=JdbcType.VARCHAR),
        @Result(column="esr_n", property="esrN", jdbcType=JdbcType.VARCHAR),
        @Result(column="pr_grup", property="prGrup", jdbcType=JdbcType.VARCHAR),
        @Result(column="pr_soed", property="prSoed", jdbcType=JdbcType.VARCHAR),
        @Result(column="kodop_p", property="kodopP", jdbcType=JdbcType.VARCHAR),
        @Result(column="kateg_poezd", property="kategPoezd", jdbcType=JdbcType.NUMERIC),
        @Result(column="esr_napr", property="esrNapr", jdbcType=JdbcType.VARCHAR),
        @Result(column="esr_napr_prib", property="esrNaprPrib", jdbcType=JdbcType.VARCHAR)
    })
    List<TmObjects> selectAll();
}