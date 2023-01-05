/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nadya.pengembalian.VO;

import com.nadya.pengembalian.entity.Pengembalian;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author win 11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
    private Pengembalian pengembalian;
    private Peminjaman peminjaman;
}
