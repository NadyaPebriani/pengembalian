/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nadya.pengembalian.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author win 11
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Anggota {
    private Long anggotaId;
    private String nama;
    private String alamat;
}
