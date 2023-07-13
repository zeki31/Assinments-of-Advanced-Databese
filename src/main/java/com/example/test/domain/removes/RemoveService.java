package com.example.test.domain.removes;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class RemoveService {

    public List<RemoveEntity> findAll(){
        return List.of(
                new RemoveEntity(1,"Angular フォームボタンの無効について","very good"),
                new RemoveEntity(2,"Wingetで簡単！開発PCセットアップ（Windows）","very good"),
                new RemoveEntity(3,"DirectMLで試す、非NVIDIA系GPUで機械学習","very good"),
                new RemoveEntity(4,"Wingetで簡単！開発PCセットアップ（Windows）","very good"),
                new RemoveEntity(5,"DirectMLでStable Diffusionを動かしてみる","very good"),
                new RemoveEntity(6,"Googleカレンダーの当日予定をSlackに通知する","very good"),
                new RemoveEntity(7,"[AWS]SAMでTypeScriptがサポートされたので5分でAPIを作成する","very good")
        );
    }
}